package chap06.book.exercise.p18exercise;

public class ShopService {
private static ShopService single= new ShopService();

private ShopService() {}

public static ShopService getInstance() {
	return single;
}
}
