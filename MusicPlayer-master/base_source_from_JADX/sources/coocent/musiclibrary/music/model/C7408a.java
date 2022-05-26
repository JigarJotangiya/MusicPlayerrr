package coocent.musiclibrary.music.model;

import java.util.Arrays;

/* renamed from: coocent.musiclibrary.music.model.a */
/* compiled from: EqualizerEntity */
public class C7408a {

    /* renamed from: a */
    private int f32569a;

    /* renamed from: b */
    private String f32570b;

    /* renamed from: c */
    private float[] f32571c;

    /* renamed from: a */
    public int mo28247a() {
        return this.f32569a;
    }

    /* renamed from: b */
    public String mo28248b() {
        return this.f32570b;
    }

    /* renamed from: c */
    public float[] mo28249c() {
        return this.f32571c;
    }

    public Object clone() {
        C7408a aVar = null;
        try {
            C7408a aVar2 = (C7408a) super.clone();
            try {
                aVar2.f32571c = (float[]) this.f32571c.clone();
                return aVar2;
            } catch (Exception unused) {
                aVar = aVar2;
            }
        } catch (Exception unused2) {
            return aVar;
        }
    }

    /* renamed from: d */
    public void mo28251d(int i) {
        this.f32569a = i;
    }

    /* renamed from: e */
    public void mo28252e(String str) {
        this.f32570b = str;
    }

    /* renamed from: f */
    public void mo28253f(float[] fArr) {
        this.f32571c = fArr;
    }

    public String toString() {
        return "EqualizerEntity{ID=" + this.f32569a + ", name='" + this.f32570b + '\'' + ", value=" + Arrays.toString(this.f32571c) + '}';
    }
}
