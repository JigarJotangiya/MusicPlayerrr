package coocent.musiclibrary.music.p289g;

import java.util.ArrayList;
import java.util.Random;

/* renamed from: coocent.musiclibrary.music.g.b */
/* compiled from: PermissionRequest */
public class C7365b {

    /* renamed from: c */
    private static Random f32430c;

    /* renamed from: a */
    private int f32431a;

    /* renamed from: b */
    private C7364a f32432b;

    public C7365b(int i) {
        this.f32431a = i;
    }

    /* renamed from: a */
    public C7364a mo28122a() {
        return this.f32432b;
    }

    /* renamed from: b */
    public int mo28123b() {
        return this.f32431a;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C7365b) && ((C7365b) obj).f32431a == this.f32431a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f32431a;
    }

    public C7365b(ArrayList<String> arrayList, C7364a aVar) {
        this.f32432b = aVar;
        if (f32430c == null) {
            f32430c = new Random();
        }
        this.f32431a = f32430c.nextInt(32768);
    }
}
