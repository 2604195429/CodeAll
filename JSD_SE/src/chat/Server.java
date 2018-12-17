package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * 聊天服务端
 * 
 * @author 张新华
 *
 */
public class Server {
	private ServerSocket server;
	private List<PrintWriter> list;

	/**
	 * 初始化服务端
	 */
	public Server() throws Exception {
		/*
		 * 初始化的同时申请服务端口
		 */
		server = new ServerSocket(8088);
		list = new ArrayList<PrintWriter>();
	}

	/**
	 * 将给定输出流存入共享集合
	 * 
	 * @param out
	 */
	private synchronized void addOut(PrintWriter out) {
		list.add(out);
	}

	/**
	 * 将给定输出流删除共享集合
	 * 
	 * @param out
	 */
	private synchronized void removeOut(PrintWriter out) {
		list.remove(out);
	}

	/**
	 * 将给定的消息发送给所有客户端
	 * 
	 * @param message
	 */
	private synchronized void sendMessage(String message) {
		for (PrintWriter out : list) {
			out.println(message);
		}
	}

	/**
	 * 服务器开始工作的方法
	 */
	public void start() {
		try {
			/*
			 * 阻塞方法，作用监听服务器端口，直到一个客户端连接并创建一个Socket，使用该Socket即可与客户端进行交互
			 */
			while (true) {
				System.out.println("等待客户端连接");
				Socket socket = server.accept();
				System.out.println("一个客户端连接上");
				/*
				 * 启动一个线程来完成与客户端的交互工作
				 */
				ClientHandler hander = new ClientHandler(socket);
				Thread t = new Thread(hander);
				t.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			Server server = new Server();
			server.start();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("启动服务器失败");
		}
	}

	/**
	 * 该线程负责处理一个客户端的交互
	 * 
	 * @author 张新华
	 *
	 */
	class ClientHandler implements Runnable {
		/*
		 * 该线程处理客户端的socket
		 */
		private String name;
		private Socket socket;

		// 客户端地址信息
		private String host;

		public ClientHandler(Socket socket) {
			this.socket = socket;
			/*
			 * 通过Socket可以获取远端计算机的地址信息
			 */
			InetAddress address = socket.getInetAddress();
			// 获取ip地址
			this.host = address.getHostAddress();
		}

		@Override
		public void run() {
			PrintWriter pw = null;
			try {
				InputStream in = socket.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(in, "utf-8"));
				name = br.readLine();
				/*
				 * 通过socket常见的输出流用于将消息发给客户端
				 */
				OutputStream out = socket.getOutputStream();
				pw = new PrintWriter(new OutputStreamWriter(out, "utf-8"), true);
				addOut(pw);
				sendMessage(name + "上线了");
				String message = null;
				while ((message = br.readLine()) != null) {
					sendMessage(name + "说" + message);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				/*
				 * 处理当前客户端断开后的逻辑
				 */
				sendMessage(name + "下线了");
				removeOut(pw);
				try {
					/*
					 * 释放资源
					 */
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
