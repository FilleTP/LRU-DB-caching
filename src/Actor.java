public class Actor {
  String name;
  int age;

  public Actor(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
      return "Actor{name='" + name + "', age=" + age + "}";
  }
}
