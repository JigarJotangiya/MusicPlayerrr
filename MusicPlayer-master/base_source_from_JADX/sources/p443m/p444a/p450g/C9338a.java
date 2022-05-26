package p443m.p444a.p450g;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p443m.p444a.p452i.C9346b;

/* renamed from: m.a.g.a */
/* compiled from: SkinAssetsLoader */
public class C9338a extends C9342e {
    /* renamed from: h */
    private String m49451h(Context context, String str) {
        String absolutePath = new File(C9346b.m49493b(context), str).getAbsolutePath();
        try {
            AssetManager assets = context.getAssets();
            InputStream open = assets.open("skins" + File.separator + str);
            FileOutputStream fileOutputStream = new FileOutputStream(absolutePath);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = open.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            fileOutputStream.close();
            open.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return absolutePath;
    }

    /* renamed from: b */
    public int mo27297b() {
        return 0;
    }

    /* renamed from: f */
    public String mo32299f(Context context, String str, int i) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo27298g(Context context, String str) {
        return m49451h(context, str);
    }
}
