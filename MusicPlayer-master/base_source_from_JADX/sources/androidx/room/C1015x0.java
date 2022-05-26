package androidx.room;

import android.content.Context;
import android.util.Log;
import androidx.room.p006d1.C0939a;
import androidx.room.p006d1.C0941c;
import androidx.room.p006d1.C0942d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import p082e.p149u.p150a.C4214b;
import p082e.p149u.p150a.C4215c;
import p082e.p149u.p150a.p151g.C4229c;

/* renamed from: androidx.room.x0 */
/* compiled from: SQLiteCopyOpenHelper */
class C1015x0 implements C4215c, C0951e0 {

    /* renamed from: g */
    private final Context f4299g;

    /* renamed from: h */
    private final String f4300h;

    /* renamed from: i */
    private final File f4301i;

    /* renamed from: j */
    private final Callable<InputStream> f4302j;

    /* renamed from: k */
    private final int f4303k;

    /* renamed from: l */
    private final C4215c f4304l;

    /* renamed from: m */
    private C0938d0 f4305m;

    /* renamed from: n */
    private boolean f4306n;

    /* renamed from: androidx.room.x0$a */
    /* compiled from: SQLiteCopyOpenHelper */
    class C1016a extends C4215c.C4216a {
        C1016a(C1015x0 x0Var, int i) {
            super(i);
        }

        /* renamed from: d */
        public void mo5611d(C4214b bVar) {
        }

        /* renamed from: g */
        public void mo5614g(C4214b bVar, int i, int i2) {
        }
    }

    C1015x0(Context context, String str, File file, Callable<InputStream> callable, int i, C4215c cVar) {
        this.f4299g = context;
        this.f4300h = str;
        this.f4301i = file;
        this.f4302j = callable;
        this.f4303k = i;
        this.f4304l = cVar;
    }

    /* renamed from: H */
    private void m5911H(boolean z) {
        String databaseName = getDatabaseName();
        File databasePath = this.f4299g.getDatabasePath(databaseName);
        C0938d0 d0Var = this.f4305m;
        C0939a aVar = new C0939a(databaseName, this.f4299g.getFilesDir(), d0Var == null || d0Var.f4103l);
        try {
            aVar.mo5457b();
            if (!databasePath.exists()) {
                m5912d(databasePath, z);
                aVar.mo5458c();
            } else if (this.f4305m == null) {
                aVar.mo5458c();
            } else {
                try {
                    int d = C0941c.m5705d(databasePath);
                    int i = this.f4303k;
                    if (d == i) {
                        aVar.mo5458c();
                    } else if (this.f4305m.mo5456a(d, i)) {
                        aVar.mo5458c();
                    } else {
                        if (this.f4299g.deleteDatabase(databaseName)) {
                            try {
                                m5912d(databasePath, z);
                            } catch (IOException e) {
                                Log.w("ROOM", "Unable to copy database file.", e);
                            }
                        } else {
                            Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                        }
                        aVar.mo5458c();
                    }
                } catch (IOException e2) {
                    Log.w("ROOM", "Unable to read database version.", e2);
                    aVar.mo5458c();
                }
            }
        } catch (IOException e3) {
            throw new RuntimeException("Unable to copy database file.", e3);
        } catch (Throwable th) {
            aVar.mo5458c();
            throw th;
        }
    }

    /* renamed from: d */
    private void m5912d(File file, boolean z) throws IOException {
        ReadableByteChannel readableByteChannel;
        if (this.f4300h != null) {
            readableByteChannel = Channels.newChannel(this.f4299g.getAssets().open(this.f4300h));
        } else if (this.f4301i != null) {
            readableByteChannel = new FileInputStream(this.f4301i).getChannel();
        } else {
            Callable<InputStream> callable = this.f4302j;
            if (callable != null) {
                try {
                    readableByteChannel = Channels.newChannel(callable.call());
                } catch (Exception e) {
                    throw new IOException("inputStreamCallable exception on call", e);
                }
            } else {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f4299g.getCacheDir());
        createTempFile.deleteOnExit();
        C0942d.m5706a(readableByteChannel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
            m5914x(createTempFile, z);
            if (!createTempFile.renameTo(file)) {
                throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
            }
            return;
        }
        throw new IOException("Failed to create directories for " + file.getAbsolutePath());
    }

    /* renamed from: p */
    private C4215c m5913p(File file) {
        String name = file.getName();
        try {
            int d = C0941c.m5705d(file);
            C4229c cVar = new C4229c();
            C4215c.C4217b.C4218a a = C4215c.C4217b.m18575a(this.f4299g);
            a.mo14408c(name);
            a.mo14407b(new C1016a(this, d));
            return cVar.mo5440a(a.mo14406a());
        } catch (IOException e) {
            throw new RuntimeException("Malformed database file, unable to read version.", e);
        }
    }

    /* renamed from: x */
    private void m5914x(File file, boolean z) {
        C4214b bVar;
        C0938d0 d0Var = this.f4305m;
        if (d0Var != null && d0Var.f4097f != null) {
            C4215c p = m5913p(file);
            if (z) {
                try {
                    bVar = p.mo5551V();
                } catch (Throwable th) {
                    p.close();
                    throw th;
                }
            } else {
                bVar = p.mo5550R();
            }
            this.f4305m.f4097f.mo5608a(bVar);
            p.close();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo5631E(C0938d0 d0Var) {
        this.f4305m = d0Var;
    }

    /* renamed from: R */
    public synchronized C4214b mo5550R() {
        if (!this.f4306n) {
            m5911H(false);
            this.f4306n = true;
        }
        return this.f4304l.mo5550R();
    }

    /* renamed from: V */
    public synchronized C4214b mo5551V() {
        if (!this.f4306n) {
            m5911H(true);
            this.f4306n = true;
        }
        return this.f4304l.mo5551V();
    }

    /* renamed from: c */
    public C4215c mo5474c() {
        return this.f4304l;
    }

    public synchronized void close() {
        this.f4304l.close();
        this.f4306n = false;
    }

    public String getDatabaseName() {
        return this.f4304l.getDatabaseName();
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f4304l.setWriteAheadLoggingEnabled(z);
    }
}
