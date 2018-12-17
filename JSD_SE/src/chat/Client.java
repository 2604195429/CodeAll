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
 * ����ͻ���
 * 
 * @author ���»�
 *
 */
public class Client {
	/*
	 * �׽��� socket�����ڿͻ�����
	 */
	private Socket socket;

	/**
	 * ��ʼ���ͻ���
	 */
	public Client() throws Exception {
		System.out.println("�������ӷ����");
		socket = new Socket("localhost", 8088);
		System.out.println("�����˽�������");

	}

	/**
	 * �����ͻ��˵ķ���
	 */
	public void start() {
		try {
			Scanner scanner = new Scanner(System.in);

			/*
			 * ��ȡһ���ֽڵ��������ͨ����д�����ݷ��͵�Զ��
			 */
			OutputStream out = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out, "utf-8"), true);
			while (true) {
				System.out.println("�������ǳ�");
				String name = scanner.nextLine();
				if (name.length() > 0) {
					pw.println(name);
					break;
				}
				System.out.println("��������ȷ����");
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
			System.out.println("�ͻ�������ʧ��");
		}
	}

	/**
	 * ���߳�������ȡ����������������Ϣ
	 * 
	 * @author ���»�
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
