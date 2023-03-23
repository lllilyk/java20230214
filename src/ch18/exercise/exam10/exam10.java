package ch18.exercise.exam10;

import java.io.*;

public class exam10 {
	public static void main(String[] args) throws Exception {
		String originalFile = "output/cute.jpg";
		String copyFile = "output/cute_copy2.jpg";
		try (InputStream is = new FileInputStream(originalFile);
				OutputStream os = new FileOutputStream(copyFile);

				InputStream iis = new BufferedInputStream(is);
				OutputStream oos = new BufferedOutputStream(os);) {

			// iis.transferTo(oos);

			byte[] data = new byte[100000];
			int len = 0;
			while ((len = iis.read(data)) != -1) {
				oos.write(data, 0, len);
			}

			// 바깥부터 닫아주기
			iis.close();
			is.close();

			oos.flush();
			oos.close();
			os.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
