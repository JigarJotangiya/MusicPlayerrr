package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import com.google.android.play.core.assetpacks.p250d.C6336b;
import com.google.android.play.core.common.C6455b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p159f.p243f.p245b.p318c.p319a.p320a.C7577a;
import p159f.p243f.p245b.p318c.p319a.p320a.C7615t;
import p159f.p243f.p245b.p318c.p319a.p320a.C7620y;
import p159f.p243f.p245b.p318c.p319a.p323d.C7632e;
import p159f.p243f.p245b.p318c.p319a.p323d.C7634g;
import p159f.p243f.p245b.p318c.p319a.p323d.C7643p;

/* renamed from: com.google.android.play.core.assetpacks.i2 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6367i2 implements C6347e4 {

    /* renamed from: g */
    private static final C7577a f29501g = new C7577a("FakeAssetPackService");

    /* renamed from: a */
    private final String f29502a;

    /* renamed from: b */
    private final C6318a0 f29503b;

    /* renamed from: c */
    private final Context f29504c;

    /* renamed from: d */
    private final C6442x2 f29505d;

    /* renamed from: e */
    private final C7620y<Executor> f29506e;

    /* renamed from: f */
    private final Handler f29507f = new Handler(Looper.getMainLooper());

    static {
        new AtomicInteger(1);
    }

    C6367i2(File file, C6318a0 a0Var, C6381l1 l1Var, Context context, C6442x2 x2Var, C7620y<Executor> yVar, C6432v2 v2Var) {
        this.f29502a = file.getAbsolutePath();
        this.f29503b = a0Var;
        this.f29504c = context;
        this.f29505d = x2Var;
        this.f29506e = yVar;
    }

    /* renamed from: g */
    static long m37680g(int i, long j) {
        if (i == 2) {
            return j / 2;
        }
        if (i == 3 || i == 4) {
            return j;
        }
        return 0;
    }

    /* renamed from: j */
    private final Bundle m37681j(int i, String str, int i2) throws C6455b {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f29505d.mo25374a());
        bundle.putInt("session_id", i);
        File[] l = m37683l(str);
        ArrayList arrayList = new ArrayList();
        long j = 0;
        for (File file : l) {
            j += file.length();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(i2 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String a = C7615t.m42420a(file);
            bundle.putParcelableArrayList(C6336b.m37593b("chunk_intents", str, a), arrayList2);
            bundle.putString(C6336b.m37593b("uncompressed_hash_sha256", str, a), m37682k(file));
            bundle.putLong(C6336b.m37593b("uncompressed_size", str, a), file.length());
            arrayList.add(a);
        }
        bundle.putStringArrayList(C6336b.m37592a("slice_ids", str), arrayList);
        bundle.putLong(C6336b.m37592a("pack_version", str), (long) this.f29505d.mo25374a());
        bundle.putInt(C6336b.m37592a("status", str), i2);
        bundle.putInt(C6336b.m37592a("error_code", str), 0);
        bundle.putLong(C6336b.m37592a("bytes_downloaded", str), m37680g(i2, j));
        bundle.putLong(C6336b.m37592a("total_bytes_to_download", str), j);
        bundle.putStringArrayList("pack_names", new ArrayList(Arrays.asList(new String[]{str})));
        bundle.putLong("bytes_downloaded", m37680g(i2, j));
        bundle.putLong("total_bytes_to_download", j);
        this.f29507f.post(new C6362h2(this, new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle)));
        return bundle;
    }

    /* renamed from: k */
    private static String m37682k(File file) throws C6455b {
        try {
            return C6377k2.m37703a(Arrays.asList(new File[]{file}));
        } catch (NoSuchAlgorithmException e) {
            throw new C6455b("SHA256 algorithm not supported.", e);
        } catch (IOException e2) {
            throw new C6455b(String.format("Could not digest file: %s.", new Object[]{file}), e2);
        }
    }

    /* renamed from: l */
    private final File[] m37683l(String str) throws C6455b {
        File file = new File(this.f29502a);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new C6351f2(str));
            if (listFiles != null) {
                if (r1 != 0) {
                    for (File a : listFiles) {
                        if (C7615t.m42420a(a).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new C6455b(String.format("No master slice available for pack '%s'.", new Object[]{str}));
                }
                throw new C6455b(String.format("No APKs available for pack '%s'.", new Object[]{str}));
            }
            throw new C6455b(String.format("Failed fetching APKs for pack '%s'.", new Object[]{str}));
        }
        throw new C6455b(String.format("Local testing directory '%s' not found.", new Object[]{file}));
    }

    /* renamed from: H */
    public final void mo25227H(int i) {
        f29501g.mo28577d("notifySessionFailed", new Object[0]);
    }

    /* renamed from: a */
    public final void mo25228a(int i, String str) {
        f29501g.mo28577d("notifyModuleCompleted", new Object[0]);
        this.f29506e.zza().execute(new C6357g2(this, i, str));
    }

    /* renamed from: b */
    public final C7632e<ParcelFileDescriptor> mo25229b(int i, String str, String str2, int i2) {
        f29501g.mo28577d("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i), str, str2, Integer.valueOf(i2));
        C7643p pVar = new C7643p();
        try {
            for (File file : m37683l(str)) {
                if (C7615t.m42420a(file).equals(str2)) {
                    pVar.mo28634c(ParcelFileDescriptor.open(file, 268435456));
                    return pVar.mo28632a();
                }
            }
            throw new C6455b(String.format("Local testing slice for '%s' not found.", new Object[]{str2}));
        } catch (FileNotFoundException e) {
            f29501g.mo28578e("getChunkFileDescriptor failed", e);
            pVar.mo28633b(new C6455b("Asset Slice file not found.", e));
        } catch (C6455b e2) {
            f29501g.mo28578e("getChunkFileDescriptor failed", e2);
            pVar.mo28633b(e2);
        }
    }

    /* renamed from: c */
    public final void mo25230c() {
        f29501g.mo28577d("keepAlive", new Object[0]);
    }

    /* renamed from: d */
    public final void mo25231d(int i, String str, String str2, int i2) {
        f29501g.mo28577d("notifyChunkTransferred", new Object[0]);
    }

    /* renamed from: e */
    public final C7632e<List<String>> mo25232e(Map<String, Long> map) {
        f29501g.mo28577d("syncPacks()", new Object[0]);
        return C7634g.m42450c(new ArrayList());
    }

    /* renamed from: f */
    public final void mo25233f(List<String> list) {
        f29501g.mo28577d("cancelDownload(%s)", list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo25291h(Intent intent) {
        this.f29503b.mo25166a(this.f29504c, intent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo25292i(int i, String str) {
        try {
            m37681j(i, str, 4);
        } catch (C6455b e) {
            f29501g.mo28578e("notifyModuleCompleted failed", e);
        }
    }
}
