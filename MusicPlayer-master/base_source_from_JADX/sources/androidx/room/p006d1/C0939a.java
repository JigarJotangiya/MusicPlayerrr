package androidx.room.p006d1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: androidx.room.d1.a */
/* compiled from: CopyLock */
public class C0939a {

    /* renamed from: e */
    private static final Map<String, Lock> f4108e = new HashMap();

    /* renamed from: a */
    private final File f4109a;

    /* renamed from: b */
    private final Lock f4110b;

    /* renamed from: c */
    private final boolean f4111c;

    /* renamed from: d */
    private FileChannel f4112d;

    public C0939a(String str, File file, boolean z) {
        File file2 = new File(file, str + ".lck");
        this.f4109a = file2;
        this.f4110b = m5694a(file2.getAbsolutePath());
        this.f4111c = z;
    }

    /* renamed from: a */
    private static Lock m5694a(String str) {
        Lock lock;
        Map<String, Lock> map = f4108e;
        synchronized (map) {
            lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
        }
        return lock;
    }

    /* renamed from: b */
    public void mo5457b() {
        this.f4110b.lock();
        if (this.f4111c) {
            try {
                FileChannel channel = new FileOutputStream(this.f4109a).getChannel();
                this.f4112d = channel;
                channel.lock();
            } catch (IOException e) {
                throw new IllegalStateException("Unable to grab copy lock.", e);
            }
        }
    }

    /* renamed from: c */
    public void mo5458c() {
        FileChannel fileChannel = this.f4112d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f4110b.unlock();
    }
}
