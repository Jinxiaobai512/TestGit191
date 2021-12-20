public class TestGit191 {
    public static void main(String[] args) {

        //同学们将自己的学号姓名当做参数，调用stuInfo函数，进行协同开发
        stuInfo("20199001","李四");
        //下面接龙同学们自己的代码修改
        stuInfo("20199002","王五");
        stuInfo("19406040138","易戬");


        stuInfo("19406040131","沈依婷");

        stuInfo("19406040118","李美乐");

        stuInfo("19406040112","沈琬琳");

        stuInfo("19406040113","林豪凯");

        stuInfo("19406040117","钟瑞琪");

        stuInfo("19406040120","俞泽枭");


        stuInfo("19406040104","钱俊杰");
        stuInfo("19406040135","戴泽");
        stuInfo("19406040119","梅子真");
    }

    public static void stuInfo(String sid, String sname) {
        System.out.println("学号：" + sid + "姓名: " + sname);
    }
}



