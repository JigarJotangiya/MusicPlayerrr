package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import p159f.p243f.p245b.p318c.p319a.p320a.C7577a;

/* renamed from: com.google.android.play.core.assetpacks.g0 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6355g0 {

    /* renamed from: c */
    private static final C7577a f29458c = new C7577a("AssetPackStorage");

    /* renamed from: a */
    private final Context f29459a;

    /* renamed from: b */
    private final C6442x2 f29460b;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        timeUnit.toMillis(14);
        timeUnit.toMillis(28);
    }

    C6355g0(Context context, C6442x2 x2Var) {
        this.f29459a = context;
        this.f29460b = x2Var;
    }

    /* renamed from: g */
    private static long m37620g(File file, boolean z) {
        if (!file.exists()) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        if (z && file.listFiles().length > 1) {
            f29458c.mo28578e("Multiple pack versions found, using highest version code.", new Object[0]);
        }
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e) {
            f29458c.mo28576c(e, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    /* renamed from: h */
    private final File m37621h(String str) {
        return new File(m37624k(), str);
    }

    /* renamed from: i */
    private final File m37622i(String str, int i, long j) {
        return new File(mo25263w(str, i, j), "merge.tmp");
    }

    /* renamed from: j */
    private final File m37623j(String str, int i, long j) {
        return new File(new File(new File(m37625l(), str), String.valueOf(i)), String.valueOf(j));
    }

    /* renamed from: k */
    private final File m37624k() {
        return new File(this.f29459a.getFilesDir(), "assetpacks");
    }

    /* renamed from: l */
    private final File m37625l() {
        return new File(m37624k(), "_tmp");
    }

    /* renamed from: m */
    private final List<File> m37626m() {
        ArrayList arrayList = new ArrayList();
        try {
            if (m37624k().exists()) {
                if (m37624k().listFiles() != null) {
                    for (File file : m37624k().listFiles()) {
                        if (!file.getCanonicalPath().equals(m37625l().getCanonicalPath())) {
                            arrayList.add(file);
                        }
                    }
                    return arrayList;
                }
            }
            return arrayList;
        } catch (IOException e) {
            f29458c.mo28575b("Could not process directory while scanning installed packs. %s", e);
        }
    }

    /* renamed from: n */
    private static void m37627n(File file) {
        if (file.listFiles() != null && file.listFiles().length > 1) {
            long g = m37620g(file, false);
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals(String.valueOf(g)) && !file2.getName().equals("stale.tmp")) {
                    m37628o(file2);
                }
            }
        }
    }

    /* renamed from: o */
    private static boolean m37628o(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File o : listFiles) {
                z &= m37628o(o);
            }
        }
        if (!file.delete()) {
            return false;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final File mo25240A(String str, int i, long j, String str2) {
        return new File(mo25241B(str, i, j, str2), "checkpoint.dat");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final File mo25241B(String str, int i, long j, String str2) {
        return new File(mo25265y(str, i, j), str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final File mo25242C(String str, int i, long j, String str2) {
        return new File(new File(new File(m37623j(str, i, j), "_slices"), "_unverified"), str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final File mo25243D(String str, int i, long j, String str2) {
        return new File(new File(new File(m37623j(str, i, j), "_slices"), "_verified"), str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final String mo25244E(String str) throws IOException {
        int length;
        File file = new File(m37624k(), str);
        if (!file.exists()) {
            f29458c.mo28574a("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.f29460b.mo25374a()));
        if (!file2.exists()) {
            f29458c.mo28574a("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.f29460b.mo25374a()));
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null || (length = listFiles.length) == 0) {
            f29458c.mo28574a("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.f29460b.mo25374a()));
            return null;
        } else if (length <= 1) {
            return listFiles[0].getCanonicalPath();
        } else {
            f29458c.mo28575b("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.f29460b.mo25374a()));
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final Map<String, Long> mo25245F() {
        HashMap hashMap = new HashMap();
        for (File name : m37626m()) {
            String name2 = name.getName();
            int g = (int) m37620g(m37621h(name2), true);
            long g2 = m37620g(mo25260t(name2, g), true);
            if (mo25261u(name2, g, g2).exists()) {
                hashMap.put(name2, Long.valueOf(g2));
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final Map<String, Long> mo25246G() {
        HashMap hashMap = new HashMap();
        for (String next : mo25247H().keySet()) {
            hashMap.put(next, Long.valueOf(mo25258r(next)));
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final Map<String, C6323b> mo25247H() {
        HashMap hashMap = new HashMap();
        try {
            for (File next : m37626m()) {
                C6323b s = mo25259s(next.getName());
                if (s != null) {
                    hashMap.put(next.getName(), s);
                }
            }
        } catch (IOException e) {
            f29458c.mo28575b("Could not process directory while scanning installed packs: %s", e);
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final void mo25248I() {
        for (File next : m37626m()) {
            if (next.listFiles() != null) {
                m37627n(next);
                long g = m37620g(next, false);
                if (((long) this.f29460b.mo25374a()) != g) {
                    try {
                        new File(new File(next, String.valueOf(g)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        f29458c.mo28575b("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File n : next.listFiles()) {
                    m37627n(n);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final void mo25249J() {
        m37628o(m37624k());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo25250a(String str, int i, long j, int i2) throws IOException {
        File i3 = m37622i(str, i, j);
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i2));
        i3.getParentFile().mkdirs();
        i3.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(i3);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo25251b(String str, int i, long j) {
        File h = m37621h(str);
        if (h.exists()) {
            for (File file : h.listFiles()) {
                if (!file.getName().equals(String.valueOf(i)) && !file.getName().equals("stale.tmp")) {
                    m37628o(file);
                } else if (file.getName().equals(String.valueOf(i))) {
                    for (File file2 : file.listFiles()) {
                        if (!file2.getName().equals(String.valueOf(j))) {
                            m37628o(file2);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo25252c(List<String> list) {
        int a = this.f29460b.mo25374a();
        for (File next : m37626m()) {
            if (!list.contains(next.getName()) && m37620g(next, true) != ((long) a)) {
                m37628o(next);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo25253d(String str, int i, long j) {
        if (!m37623j(str, i, j).exists()) {
            return true;
        }
        return m37628o(m37623j(str, i, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo25254e(String str, int i, long j) {
        if (!mo25261u(str, i, j).exists()) {
            return true;
        }
        return m37628o(mo25261u(str, i, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo25255f(String str) {
        try {
            return mo25244E(str) != null;
        } catch (IOException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final int mo25256p(String str) {
        return (int) m37620g(m37621h(str), true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final int mo25257q(String str, int i, long j) throws IOException {
        File i2 = m37622i(str, i, j);
        if (!i2.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(i2);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") != null) {
                try {
                    return Integer.parseInt(properties.getProperty("numberOfMerges"));
                } catch (NumberFormatException e) {
                    throw new C6361h1("Merge checkpoint file corrupt.", (Exception) e);
                }
            } else {
                throw new C6361h1("Merge checkpoint file corrupt.");
            }
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final long mo25258r(String str) {
        return m37620g(mo25260t(str, (int) m37620g(m37621h(str), true)), true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final C6323b mo25259s(String str) throws IOException {
        String E = mo25244E(str);
        if (E == null) {
            return null;
        }
        File file = new File(E, "assets");
        if (file.isDirectory()) {
            return C6323b.m37578d(E, file.getCanonicalPath());
        }
        f29458c.mo28575b("Failed to find assets directory: %s", file);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final File mo25260t(String str, int i) {
        return new File(m37621h(str), String.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final File mo25261u(String str, int i, long j) {
        return new File(mo25260t(str, i), String.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final File mo25262v(String str, int i, long j) {
        return new File(mo25261u(str, i, j), "_metadata");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final File mo25263w(String str, int i, long j) {
        return new File(m37623j(str, i, j), "_packs");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final File mo25264x(String str, int i, long j) {
        return new File(mo25262v(str, i, j), "properties.dat");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final File mo25265y(String str, int i, long j) {
        return new File(new File(m37623j(str, i, j), "_slices"), "_metadata");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final File mo25266z(String str, int i, long j, String str2) {
        return new File(mo25241B(str, i, j, str2), "checkpoint_ext.dat");
    }
}
