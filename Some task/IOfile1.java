import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.*;
import java.util.*;

class IOfile1 {
    public static void main(String[] args) {
        Scanner ap = new Scanner(System.in);
        while (true) {
            System.out.println("File Manageku");
            System.out.println("1. Buat file");
            System.out.println("2. Baca file");
            System.out.println("3. Duplikat file");
            System.out.println("4. Edit file");
            System.out.println("5. Hapus file");

            int n = ap.nextInt();
            

            if (n == 1) {
                System.out.print("Input nama file :");
                String filename = ap.next();
                System.out.println("Input isi file : ");
                String content = ap.next();

                FileWriter fw = null;
                PrintWriter pw = null;

                try {
                    fw = new FileWriter(filename);
                    pw = new PrintWriter(fw);
                    pw.println(content);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }finally {
                    try {
                        if (fw != null) {
                             fw.close();
                        }
                        if (pw != null) {
                            pw.close();
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            } else if (n == 2) {
                System.out.println("Input nama file yang akan dibaca :");
                String filename = ap.next();

                FileReader fr = null;
                BufferedReader br = null;

                try {
                    fr = new FileReader(filename);
                    br = new BufferedReader(fr);
                    String s;
                    System.out.println("Isi file: ");
                    while ((s = br.readLine()) != null) {
                        System.out.println(s);
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                } finally {
                    try {
                        if (fr != null) {
                            fr.close();
                        }
                        if (br != null) {
                            br.close();
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            } else if (n == 3) {
                System.out.println("Input nama file yang akan diduplikat : ");
                String oldfilename = ap.next();
                System.out.println("Input nama file baru : ");
                String newfilename = ap.next();

                FileReader fr = null;
                BufferedReader br = null;
                FileWriter fw = null;
                PrintWriter pw = null;

                try {
                    fr = new FileReader(oldfilename);
                    br = new BufferedReader(fr);

                    String s;
                    String content = "";
                    while ((s = br.readLine()) != null) {
                        content += s;
                        content += "\n";
                    }
                    fw = new FileWriter(newfilename);
                    pw = new PrintWriter(fw);
                    pw.println(content);

                    System.out.println("Isi file baru : ");
                    System.out.println(content);

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                } finally {
                    try {
                        if (fr != null) {
                            fr.close();
                        }
                        if (br != null) {
                            br.close();
                        }
                        if (fw != null) {
                            fw.close();
                        }
                        if (pw != null) {
                            pw.close();
                        }

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            } else if (n == 4) {
                File f = null;
                BufferedReader br = null;
                FileWriter fw = null;
                PrintWriter pw = null;

                System.out.println("Input file yang akan diedit : ");
                String Oldfile = ap.next();
                ap.nextLine();

                try {
                    f = new File(Oldfile);
                    fw = new FileWriter(f);
                    pw = new PrintWriter(fw);
                    System.out.println("Isi file baru : ");
                    String content = ap.nextLine();
                    pw.println(content);

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }finally {
                    try {
                        // if (f != null) {
                        //     f.();
                        // }    
                        if (fw != null) {
                             fw.close();
                        }
                        if (pw != null) {
                            pw.close();
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            } else if (n == 5){
                System.out.println(" input file yang akan dihapus : ");
                String file = ap.next();
                File f = null;
                try {
                    f = new File(file);
                    f.delete();
                    System.out.println("Berhasil");
                } catch (Exception e) {
                    System.out.println("Gagal");
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}