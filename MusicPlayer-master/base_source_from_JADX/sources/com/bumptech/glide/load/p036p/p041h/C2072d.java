package com.bumptech.glide.load.p036p.p041h;

import android.util.Log;
import com.bumptech.glide.load.C1746c;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.C1793l;
import com.bumptech.glide.load.p030n.C1902v;
import com.bumptech.glide.p051s.C2179a;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.p.h.d */
/* compiled from: GifDrawableEncoder */
public class C2072d implements C1793l<C2070c> {
    /* renamed from: b */
    public C1746c mo7750b(C1790i iVar) {
        return C1746c.SOURCE;
    }

    /* renamed from: c */
    public boolean mo7680a(C1902v<C2070c> vVar, File file, C1790i iVar) {
        try {
            C2179a.m10239e(vVar.get().mo8186c(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }
}
