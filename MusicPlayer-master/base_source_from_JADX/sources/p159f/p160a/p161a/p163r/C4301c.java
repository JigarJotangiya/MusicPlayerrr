package p159f.p160a.p161a.p163r;

import android.content.Context;
import android.graphics.Typeface;
import p082e.p098e.C3478g;

/* renamed from: f.a.a.r.c */
/* compiled from: TypefaceHelper */
public class C4301c {

    /* renamed from: a */
    private static final C3478g<String, Typeface> f12859a = new C3478g<>();

    /* renamed from: a */
    public static Typeface m18809a(Context context, String str) {
        C3478g<String, Typeface> gVar = f12859a;
        synchronized (gVar) {
            if (!gVar.containsKey(str)) {
                try {
                    Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), String.format("fonts/%s", new Object[]{str}));
                    gVar.put(str, createFromAsset);
                    return createFromAsset;
                } catch (RuntimeException unused) {
                    return null;
                }
            } else {
                Typeface typeface = gVar.get(str);
                return typeface;
            }
        }
    }
}
