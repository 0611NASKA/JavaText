package Text.Chap09;

public class Exercise9_1 {
    public static void main(String[] args) {
        // 長さ3のHuman型配列を作成し、各要素にHumanオブジェクトを格納する
        // これにより、複数のHumanオブジェクトを一括で管理できる
        Human[] x = new Human[3];
        for (int i = 0; i < x.length; i++) {
            String humanName = "HumanX" + (i + 1);
            // 配列の各要素にHumanオブジェクトを作成し、名前、身長、体重を設定する
            // これにより、各Humanオブジェクトを個別に初期化できる
            x[i] = new Human(humanName, 150, 50);
        }
        // 配列xの各要素であるHumanオブジェクトのputSpec()メソッドを呼び出す
        // これにより、各Humanオブジェクトの詳細情報を表示できる
        for (int i = 0; i < x.length; i++) {
            x[i].putSpec();
        }

        System.out.println("-------------");

        // 配列の初期化時に直接Humanオブジェクトを指定して作成する
        // これにより、配列の作成とHumanオブジェクトの初期化を同時に行える
        Human[] y = {
                new Human("HumanY1", 160, 60),
                new Human("HumanY2", 160, 60),
                new Human("HumanY3", 160, 60)
        };

        // 配列yの各要素であるHumanオブジェクトのputSpec()メソッドを呼び出す
        // これにより、各Humanオブジェクトの詳細情報を表示できる
        for (int i = 0; i < y.length; i++) {
            y[i].putSpec();
        }

        System.out.println("-------------");

        Human[] z;
        // 配列の初期化時に直接Humanオブジェクトを指定して作成する（別の方法）
        // これにより、配列の宣言と初期化を分離できる
        z = new Human[] {
                new Human("HumanZ1", 170, 70),
                new Human("HumanZ2", 170, 70),
                new Human("HumanZ3", 170, 70)
        };

        // 配列zの各要素であるHumanオブジェクトのputSpec()メソッドを呼び出す
        // これにより、各Humanオブジェクトの詳細情報を表示できる
        for (int i = 0; i < z.length; i++) {
            z[i].putSpec();
        }
    }
}
