<<<<<<< HEAD
package hust.soict.dsai.garbage;
import java.util.*;

public class ConcatenationInLoops {

	public static void main(String[] args) {
		Random r = new Random(123);
		long start = System.currentTimeMillis();
		String s = "";
		for (int i = 0; i < 65536; ++i)
			s += r.nextInt(2);
		System.out.println(System.currentTimeMillis() - start);
		
		r = new Random(123);
		start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 65536; ++i)
			sb.append(r.nextInt(2));
		s = sb.toString();
		System.out.println(System.currentTimeMillis() - start);
	}

}
=======
package hust.soict.dsai.garbage;
import java.util.*;

public class ConcatenationInLoops {

	public static void main(String[] args) {
		Random r = new Random(123);
		long start = System.currentTimeMillis();
		String s = "";
		for (int i = 0; i < 65536; ++i)
			s += r.nextInt(2);
		System.out.println(System.currentTimeMillis() - start);
		
		r = new Random(123);
		start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 65536; ++i)
			sb.append(r.nextInt(2));
		s = sb.toString();
		System.out.println(System.currentTimeMillis() - start);
	}

}
>>>>>>> 3a04ccefcf664d76ffcc06b6a47a57043f566a1a
