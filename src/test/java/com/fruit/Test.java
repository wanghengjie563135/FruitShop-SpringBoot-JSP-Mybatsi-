package com.fruit;

import com.fruit.FruitApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/*在测试类实例化的同时去启动springboot应用
等价于 new ClassPathXMlApplicationContext();
*/
@RunWith(SpringRunner.class)
//指定测试类启动时入口类的位置  //等价于指定工厂的位置
@SpringBootTest(classes = FruitApplication.class)
public class Test {

}
