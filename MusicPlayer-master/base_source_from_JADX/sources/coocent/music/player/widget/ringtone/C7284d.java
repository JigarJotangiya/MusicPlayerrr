package coocent.music.player.widget.ringtone;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: coocent.music.player.widget.ringtone.d */
/* compiled from: CheapSoundFile */
public class C7284d {

    /* renamed from: c */
    static C7285a[] f32203c = {C7277a.m41278p(), C7280b.m41299m(), C7282c.m41315l(), C7287e.m41341l()};

    /* renamed from: d */
    static ArrayList<String> f32204d = new ArrayList<>();

    /* renamed from: e */
    static HashMap<String, C7285a> f32205e = new HashMap<>();

    /* renamed from: a */
    protected C7286b f32206a = null;

    /* renamed from: b */
    protected File f32207b = null;

    /* renamed from: coocent.music.player.widget.ringtone.d$a */
    /* compiled from: CheapSoundFile */
    public interface C7285a {
        /* renamed from: a */
        C7284d mo27963a();

        /* renamed from: b */
        String[] mo27964b();
    }

    /* renamed from: coocent.music.player.widget.ringtone.d$b */
    /* compiled from: CheapSoundFile */
    public interface C7286b {
        /* renamed from: a */
        boolean mo26574a(double d);
    }

    static {
        for (C7285a aVar : f32203c) {
            for (String str : aVar.mo27964b()) {
                f32204d.add(str);
                f32205e.put(str, aVar);
            }
        }
    }

    protected C7284d() {
    }

    /* renamed from: c */
    public static C7284d m41327c(String str, C7286b bVar) throws FileNotFoundException, IOException {
        C7285a aVar;
        File file = new File(str);
        if (file.exists()) {
            String[] split = file.getName().toLowerCase().split("\\.");
            if (split.length < 2 || (aVar = f32205e.get(split[split.length - 1])) == null) {
                return null;
            }
            C7284d a = aVar.mo27963a();
            a.mo27970k(bVar);
            a.mo27946a(file);
            return a;
        }
        throw new FileNotFoundException(str);
    }

    /* renamed from: a */
    public void mo27946a(File file) throws FileNotFoundException, IOException {
        this.f32207b = file;
    }

    /* renamed from: b */
    public void mo27947b(File file, int i, int i2) throws IOException {
        throw null;
    }

    /* renamed from: d */
    public int mo27948d() {
        throw null;
    }

    /* renamed from: e */
    public String mo27949e() {
        throw null;
    }

    /* renamed from: f */
    public int[] mo27950f() {
        throw null;
    }

    /* renamed from: g */
    public int mo27951g() {
        throw null;
    }

    /* renamed from: h */
    public int mo27952h() {
        throw null;
    }

    /* renamed from: i */
    public int mo27953i() {
        throw null;
    }

    /* renamed from: j */
    public int mo27969j(int i) {
        return -1;
    }

    /* renamed from: k */
    public void mo27970k(C7286b bVar) {
        this.f32206a = bVar;
    }
}
