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
        stuInfo("19406040115","胡祺乐");

        stuInfo("19406040121","李杰克");

        stuInfo("19406040117","钟瑞琪");

        stuInfo("19406040120","俞泽枭");


        stuInfo("19406040104","钱俊杰");
        stuInfo("19406040135","戴泽");
        stuInfo("19406040119","梅子真");
        stuInfo("19406040136", "魏昌宇");
        stuInfo("19406040114","张轩睿 ");
        stuInfo("19406040107","金凯杰 ");
        stuInfo("19406040106","赵珉泽 ");
        stuInfo("19406040103","张嘉诚 ");
        stuInfo("19406040108","李响 ");
        stuInfo("19406040111","周圣哲");

        stuInfo("19406040109","张思鹏");

    }

    public static void stuInfo(String sid, String sname) {
        System.out.println("学号：" + sid + "姓名: " + sname);
    }
}



