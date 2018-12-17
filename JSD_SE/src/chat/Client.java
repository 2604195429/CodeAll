package chat;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 聊天客户端
 * 
 * @author 张新华
 *
 */
public class Client {
	/*
	 * 套接字 socket运行在客户端上
	 */
	private Socket socket;

	/**
	 * 初始化客户端
	 */
	public Client() throws Exception {
		System.out.println("正在连接服务端");
		socket = new Socket("localhost", 8088);
		System.out.println("与服务端建立连接");

	}

	/**
	 * 启动客户端的方法
	 */
	public void start() {
		try {
			Scanner scanner = new Scanner(System.in);

			/*
			 * 获取一个字节的输出流，通过流写出数据发送到远端
			 */
			OutputStream out = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out, "utf-8"), true);
			while (true) {
				System.out.println("请输入昵称");
				String name = scanner.nextLine();
				if (name.length() > 0) {
					pw.println(name);
					break;
				}
				System.out.println("请输入正确名字");
			}

			new Thread(new ServerHandler()).start();
			while (true) {
				pw.println(scanner.nextLine());
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			Client client = new Client();
			client.start();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("客户端启动失败");
		}
	}

	/**
	 * 该线程用来读取服务器发过来的消息
	 * 
	 * @author 张新华
	 *
	 */
	class ServerHandler implements Runnable {

		@Override
		public void run() {
			try {
				InputStream in = socket.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(in, "utf-8"));
				String message = null;
				while ((message = br.readLine()) != null) {
					System.out.println(message);
				}
				System.out.println(br.readLine());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
