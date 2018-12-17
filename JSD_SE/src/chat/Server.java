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
 * ��������
 * 
 * @author ���»�
 *
 */
public class Server {
	private ServerSocket server;
	private List<PrintWriter> list;

	/**
	 * ��ʼ�������
	 */
	public Server() throws Exception {
		/*
		 * ��ʼ����ͬʱ�������˿�
		 */
		server = new ServerSocket(8088);
		list = new ArrayList<PrintWriter>();
	}

	/**
	 * ��������������빲����
	 * 
	 * @param out
	 */
	private synchronized void addOut(PrintWriter out) {
		list.add(out);
	}

	/**
	 * �����������ɾ��������
	 * 
	 * @param out
	 */
	private synchronized void removeOut(PrintWriter out) {
		list.remove(out);
	}

	/**
	 * ����������Ϣ���͸����пͻ���
	 * 
	 * @param message
	 */
	private synchronized void sendMessage(String message) {
		for (PrintWriter out : list) {
			out.println(message);
		}
	}

	/**
	 * ��������ʼ�����ķ���
	 */
	public void start() {
		try {
			/*
			 * �������������ü����������˿ڣ�ֱ��һ���ͻ������Ӳ�����һ��Socket��ʹ�ø�Socket������ͻ��˽��н���
			 */
			while (true) {
				System.out.println("�ȴ��ͻ�������");
				Socket socket = server.accept();
				System.out.println("һ���ͻ���������");
				/*
				 * ����һ���߳��������ͻ��˵Ľ�������
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
			System.out.println("����������ʧ��");
		}
	}

	/**
	 * ���̸߳�����һ���ͻ��˵Ľ���
	 * 
	 * @author ���»�
	 *
	 */
	class ClientHandler implements Runnable {
		/*
		 * ���̴߳���ͻ��˵�socket
		 */
		private String name;
		private Socket socket;

		// �ͻ��˵�ַ��Ϣ
		private String host;

		public ClientHandler(Socket socket) {
			this.socket = socket;
			/*
			 * ͨ��Socket���Ի�ȡԶ�˼�����ĵ�ַ��Ϣ
			 */
			InetAddress address = socket.getInetAddress();
			// ��ȡip��ַ
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
				 * ͨ��socket��������������ڽ���Ϣ�����ͻ���
				 */
				OutputStream out = socket.getOutputStream();
				pw = new PrintWriter(new OutputStreamWriter(out, "utf-8"), true);
				addOut(pw);
				sendMessage(name + "������");
				String message = null;
				while ((message = br.readLine()) != null) {
					sendMessage(name + "˵" + message);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				/*
				 * ����ǰ�ͻ��˶Ͽ�����߼�
				 */
				sendMessage(name + "������");
				removeOut(pw);
				try {
					/*
					 * �ͷ���Դ
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
