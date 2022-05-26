package coocent.musiclibrary.music.localLyric;

import android.app.Activity;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/* renamed from: coocent.musiclibrary.music.localLyric.a */
/* compiled from: DefaultLrcParser */
public class C7403a {

    /* renamed from: a */
    public static String f32550a = null;

    /* renamed from: b */
    public static String f32551b = ".lrc";

    /* renamed from: a */
    public static List<C7405c> m41750a(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            return new C7404b().mo28230a(str);
        } catch (FileNotFoundException | IOException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static List<C7405c> m41751b(Activity activity, String str, String str2, String str3) {
        C7404b bVar = new C7404b();
        File file = new File(str2);
        if (!file.exists()) {
            return null;
        }
        File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            return null;
        }
        File parentFile2 = parentFile.getParentFile();
        if (!parentFile2.exists()) {
            return null;
        }
        bVar.mo28233d(parentFile2, str, true, str3);
        return m41750a(bVar.mo28234e());
    }
}
