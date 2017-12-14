package compare2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Test02 {

    public static void main(String[] args) {
        List<Student> list = new ArrayList();     // Java 7����ʯ�﷨(����������ļ������в���Ҫд����)
        list.add(new Student("Hao LUO", 33));
        list.add(new Student("XJ WANG", 32));
        list.add(new Student("Bruce LEE", 60));
        list.add(new Student("Bob YANG", 22));

        // ͨ��sort�����ĵڶ�����������һ��Comparator�ӿڶ���
        // �൱���Ǵ���һ���Ƚ϶����С���㷨��sort������
        // ����Java��û�к���ָ�롢�º�����ί�������ĸ���
        // ���Ҫ��һ���㷨����һ��������Ψһ��ѡ�����ͨ���ӿڻص�
        Collections.sort(list, new Comparator<Student> () {

            
            public int compare(Student o1, Student o2) {
                return o1.getAge()-(o2.getAge());    // �Ƚ�ѧ������
            }
        });

        for(Student stu : list) {
            System.out.println(stu);
        }
//      ������: 
//      Student [name=Bob YANG, age=22]
//      Student [name=Bruce LEE, age=60]
//      Student [name=Hao LUO, age=33]
//      Student [name=XJ WANG, age=32]
    }
}