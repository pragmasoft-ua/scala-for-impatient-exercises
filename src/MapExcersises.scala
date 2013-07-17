object MapExcersises extends App {
	Console.out.println(getClass().getName());
	val gadgets = Map("Galaxy nexus" -> 600, "iPad" -> 800, "Galaxy tab" -> 500)
	val discounted = for ((name, price) <- gadgets) yield (name, price * 0.9)
	Console.out.println(discounted);
}