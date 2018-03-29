
Save New Duplicate & Edit Just Text Twitter
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
80
81
82
83
84
85
86
87
88
89
90
91
92
93
94
95
96
97
98
99
100
101
102
103
104
105
106
107
108
109
110
111
112
113
114
115
116
117
118
119
120
121
122
123
124
125
126
127
128
129
130
131
132
133
134
135
136
137
138
139
140
141
142
143
144
145
146
147
148
149
150
151
152
153
154
155
156
157
158
159
160
161
162
163
164
165
166
167
168
169
170
171
172
173
174
175
176
177
178
179
180
181
182
183
184
185
186
187
188
189
190
191
192
193
194
195
196
197
198
199
200
201
202
203
204
205
206
207
208
209
210
211
212
213
214
215
216
217
218
219
220
221
222
223
224
225
226
227
228
229
230
231
232
233
234
235
236
237
238
239
240
241
242
243
244
245
246
247
248
249
250
251
252
253
254
255
256
257
258
259
260
261
262
263
264
265
266
267

import java.io.*;
import java.util.Scanner;

class Employee
{
    public static void eMenu()
    {
        Scanner ss=new Scanner(System.in);


        while(true)
        {
            int ch2;
            System.out.println("**************************");
            System.out.println("*******Employee************");
            System.out.println("1. Add");
            System.out.println("2. Display");
            System.out.println("3. Search");
            System.out.println("4. delete");
            System.out.println("5.update");
            System.out.println("6. exit");
            System.out.println("\n Enter Your CHoice : ");
            System.out.println("************************");
            ch2=ss.nextInt();

            switch(ch2)
            {
                case 1:
                    try{
                        add();
                    }
                    catch(IOException ie)
                    {
                    }


                    break;
                case 2:
                    try{
                        display();
                    }
                    catch(IOException e)
                    {
                    }

                    break;
                case 3:
                    try{
                        searchFile();
                    }
                    catch(IOException ie)
                    {
                    }


                    break;
                case 4:
                    try{
                        delete();
                    }
                    catch(IOException ie)
                    {
                    }

                    break;
                case 5:
                    try{
                        update();
                    }
                    catch(IOException ie)
                    {
                    }

                    break;
                case 6:
                    System.out.println("hi");
                    return;

                default:
            }
         }
    }

    public static void add()throws IOException
    {
        String id,name,phonenumber,city,department;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);

            FileWriter fw=new FileWriter("Employee.txt",true);
        try{
            System.out.println("Enter Employee id : ");
            id=br.readLine();
            fw.write(id+"\r\n");

            System.out.println("Enter EmployeeName : ");
            name=br.readLine();
            fw.write(name+"\r\n");

            System.out.println("Enter Employee phone number : ");
            phonenumber=br.readLine();
            fw.write(phonenumber+"\r\n");

            System.out.println("Enter Employee city : ");
            city=br.readLine();
            fw.write(city+"\r\n");

            System.out.println("Enter Student department : ");
            department=br.readLine();
            fw.write(department+"\r\n");

            System.out.println("***add success*** ");
            fw.write("Employee.txt");
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            //System.out.println(e);
        }

            /*System.out.println("Would you like to input another
data? 'y' to enter , 'n' to exit , 's' for search");
            char choice;
            choice = sc.next().charAt(0);

        switch(choice)
        {
            case 'Y':
            case 'y':
                add();
            break;
            case 'N':
            case 'n':
                System.out.println("bye...bye...");
                System.exit(0);

        }*/

        ///ee.close();
    }
    public static void searchFile()throws IOException
    {
         String Search;
        System.out.println("search");
        Scanner scanned = new Scanner(System.in);
        String Name;
                System.out.print("Enter ID to search: ");
                       String rt = scanned.next();
                //rt = rt+".0";
        try
        {
                     Scanner scannedFile = new Scanner(new File("Student.txt"));
        while(scannedFile.hasNext())
        {
             Search = scannedFile.next();
            Name=scannedFile.next();

                   if(Search.equals(rt))
        {
                           System.out.println("Found: " +Search+"\r\n"+Name);

                     }
        else
        {
                           System.out.println("No data found.");
                   }

        }
             }catch(Exception e){}
        //finally{}
        //break;
    }
    public static void display()throws IOException
    {
        String red;

        FileReader ff=new FileReader("Employee.txt");
        BufferedReader br=new BufferedReader(ff);
        try{

            red=br.readLine();
            while(red!=null)
            {
                System.out.println(red);
                red=br.readLine();
            }
        }
        catch(Exception e)
        {}


    }
    public static void delete()throws IOException
    {
        try
        {
                String id,name,phonenumber,city,department;
                Scanner sc=new Scanner (new File ("Employee.txt"));
                Scanner scanned = new Scanner(System.in);
                String Name;
                    System.out.print("Enter ID to delete: ");
                           String rt = scanned.next();
                    //rt = rt+".0";

                while(sc.hasNext())
                {
                    id=sc.next();
                    name=sc.next();
                    city=sc.next();
                    phonenumber=sc.next();
                    department=sc.next();

System.out.println("==================================");
                    System.out.println("id : "+id);
                    System.out.println("name : "+name);
                    System.out.println("city : "+city);
                    System.out.println("phonenumber is : "+phonenumber);
                    System.out.println("department: "+department);

System.out.println("==================================");
                }
                    sc.close();
        }
        catch(Exception e)
        {}
    }

     public static void update()throws IOException
         {
         try
             {
                 File file = new File("Student.txt");

                 BufferedReader bfr = new BufferedReader(new FileReader(file));
         Scanner sp = new Scanner(System.in);

                  String lines = "", content = "", find = "" , replace = "";

         System.out.println("enter a word to be replaced :");
        find=sp.nextLine();

        System.out.println("enter a word replaced by :");
        replace=sp.nextLine();

                while((lines = bfr.readLine()) != null)
                 {
                 content += lines + "\r\n";
                  }

             bfr.close();

            String newtext = content.replaceAll(find,replace);

             FileWriter writer = new FileWriter("Student.txt");
             writer.write(newtext);
        writer.close();
         }
         catch (IOException ie)
             {
            System.out.println( ie);
         }
     }

}
