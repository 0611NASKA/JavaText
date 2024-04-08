package Text.Chap08;

public class Human {
  // フィールド
  private String name; // 人間の名前を保持するためのフィールド。これにより、各Humanオブジェクトは名前を持つことができる。
  private int height; // 人間の身長を保持するためのフィールド。これにより、各Humanオブジェクトは身長を持つことができる。
  private int weight; // 人間の体重を保持するためのフィールド。これにより、各Humanオブジェクトは体重を持つことができる。

  // コンストラクタ
  Human(String name, int height, int weight) { // Humanオブジェクトを作成するためのコンストラクタ。これにより、名前、身長、体重を指定してHumanオブジェクトを作成できる。
    this.name = name; // 引数で受け取った名前をフィールドに設定。これにより、作成されるHumanオブジェクトは指定された名前を持つ。
    this.height = height; // 引数で受け取った身長をフィールドに設定。これにより、作成されるHumanオブジェクトは指定された身長を持つ。
    this.weight = weight; // 引数で受け取った体重をフィールドに設定。これにより、作成されるHumanオブジェクトは指定された体重を持つ。
  }

  // メソッド
  void putSpec() { // Humanオブジェクトのスペック（名前、身長、体重）を表示するためのメソッド。これにより、Humanオブジェクトのスペックを一度に表示できる。
    System.out.printf("名前：%s\n", name); // 名前を表示。これにより、Humanオブジェクトの名前を確認できる。
    System.out.printf("身長：%d cm\n", height); // 身長を表示。これにより、Humanオブジェクトの身長を確認できる。
    System.out.printf("体重：%d kg\n", weight); // 体重を表示。これにより、Humanオブジェクトの体重を確認できる。
  }
}
