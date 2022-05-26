package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import p159f.p243f.p245b.p318c.p319a.p320a.C7577a;

/* renamed from: com.google.android.play.core.assetpacks.o2 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6397o2 {

    /* renamed from: b */
    private static final C7577a f29599b = new C7577a("MergeSliceTaskHandler");

    /* renamed from: a */
    private final C6355g0 f29600a;

    C6397o2(C6355g0 g0Var) {
        this.f29600a = g0Var;
    }

    /* renamed from: b */
    private static void m37761b(File file, File file2) {
        if (file.isDirectory()) {
            file2.mkdirs();
            for (File file3 : file.listFiles()) {
                m37761b(file3, new File(file2, file3.getName()));
            }
            if (!file.delete()) {
                String valueOf = String.valueOf(file);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb.append("Unable to delete directory: ");
                sb.append(valueOf);
                throw new C6361h1(sb.toString());
            }
        } else if (file2.exists()) {
            String valueOf2 = String.valueOf(file2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 51);
            sb2.append("File clashing with existing file from other slice: ");
            sb2.append(valueOf2);
            throw new C6361h1(sb2.toString());
        } else if (!file.renameTo(file2)) {
            String valueOf3 = String.valueOf(file);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 21);
            sb3.append("Unable to move file: ");
            sb3.append(valueOf3);
            throw new C6361h1(sb3.toString());
        }
    }

    /* renamed from: a */
    public final void mo25349a(C6392n2 n2Var) {
        File D = this.f29600a.mo25243D(n2Var.f29410b, n2Var.f29588c, n2Var.f29589d, n2Var.f29590e);
        if (D.exists()) {
            File w = this.f29600a.mo25263w(n2Var.f29410b, n2Var.f29588c, n2Var.f29589d);
            if (!w.exists()) {
                w.mkdirs();
            }
            m37761b(D, w);
            try {
                this.f29600a.mo25250a(n2Var.f29410b, n2Var.f29588c, n2Var.f29589d, this.f29600a.mo25257q(n2Var.f29410b, n2Var.f29588c, n2Var.f29589d) + 1);
            } catch (IOException e) {
                f29599b.mo28575b("Writing merge checkpoint failed with %s.", e.getMessage());
                throw new C6361h1("Writing merge checkpoint failed.", e, n2Var.f29409a);
            }
        } else {
            throw new C6361h1(String.format("Cannot find verified files for slice %s.", new Object[]{n2Var.f29590e}), n2Var.f29409a);
        }
    }
}
