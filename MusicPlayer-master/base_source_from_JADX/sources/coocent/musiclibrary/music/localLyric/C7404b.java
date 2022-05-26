package coocent.musiclibrary.music.localLyric;

import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: coocent.musiclibrary.music.localLyric.b */
/* compiled from: LrcRead */
public class C7404b {

    /* renamed from: a */
    public String f32552a;

    /* renamed from: a */
    public List<C7405c> mo28230a(String str) throws FileNotFoundException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(str)), "UTF-8"));
        ArrayList arrayList = new ArrayList();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                return arrayList;
            } else if (!BuildConfig.FLAVOR.equals(readLine.trim())) {
                String[] split = readLine.replace("[", BuildConfig.FLAVOR).replace("]", "@").split("@");
                if (split.length > 1) {
                    arrayList.add(new C7405c(split[0], mo28231b(split[0]), split[1]));
                }
            }
        }
    }

    /* renamed from: b */
    public int mo28231b(String str) {
        String[] split = str.replace(":", ".").replace(".", "@").split("@");
        try {
            int parseInt = Integer.parseInt(split[0]);
            return (((parseInt * 60) + Integer.parseInt(split[1])) * 1000) + (Integer.parseInt(split[2]) * 10);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: c */
    public void mo28232c(File file, File file2) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            PrintWriter printWriter = new PrintWriter(file2);
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    printWriter.println(readLine);
                } else {
                    bufferedReader.close();
                    printWriter.close();
                    return;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: d */
    public void mo28233d(File file, String str, boolean z, String str2) {
        File[] listFiles;
        if (file != null && file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory() && !file2.getName().startsWith(".")) {
                    mo28233d(file2, str, z, str2);
                } else if (file2.isFile() && file2.getAbsolutePath().endsWith(".lrc") && (file2.getName().toLowerCase(Locale.US).contains(str) || file2.getName().contains(str))) {
                    File file3 = new File(C7403a.f32550a + str + C7403a.f32551b);
                    if (file3.exists()) {
                        Log.e("lyric", "要改成歌曲名:" + str2);
                        file3.delete();
                        File file4 = new File(C7403a.f32550a + str2 + C7403a.f32551b);
                        this.f32552a = file4.getAbsolutePath();
                        Log.e("lyric", "已經存在了，刪除替換");
                        mo28232c(file2, file4);
                    } else if (!z) {
                        this.f32552a = file3.getAbsolutePath();
                        Log.e("lyric", "不存在，複製");
                        mo28232c(file2, file3);
                    } else {
                        Log.e("lyric", "要改成歌曲名:" + str2);
                        File file5 = new File(C7403a.f32550a + str2 + C7403a.f32551b);
                        this.f32552a = file5.getAbsolutePath();
                        Log.e("lyric", "不存在，替換");
                        mo28232c(file2, file5);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public String mo28234e() {
        return this.f32552a;
    }
}
