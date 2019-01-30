package test;

import java.util.stream.Stream;

public class AA {

	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println(args.length);
		Stream.of(args).forEach(System.out::println);
	}
}
