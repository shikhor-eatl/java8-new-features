package test.features.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamTest {

    public static void main(String[] args) {
        StreamTest streamTest = new StreamTest();
        streamTest.action();
    }

    private void action() {
        List<StringIntegerMap> list = this.prepareList();
        int total = list.stream().mapToInt(obj -> obj.no).sum();

        System.out.println(total);
    }

    public List<StringIntegerMap> prepareList() {
        List<StringIntegerMap> list = new ArrayList<>();
        list.add(new StringIntegerMap("shishir", 10));
        list.add(new StringIntegerMap("meher", 20));
        list.add(new StringIntegerMap("minty", 40));
        list.add(new StringIntegerMap("mou", 5));
        list.add(new StringIntegerMap("manesh", 5));

        return list;
    }

    class StringIntegerMap {
        public String name;
        public Integer no;

        public StringIntegerMap(String name, Integer no) {
            this.name = name;
            this.no = no;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getNo() {
            return no;
        }

        public void setNo(Integer no) {
            this.no = no;
        }
    }
}
