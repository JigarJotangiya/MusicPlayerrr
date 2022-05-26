package p159f.p166c.p224o.p226l;

import android.os.Environment;
import android.os.StatFs;

/* renamed from: f.c.o.l.h */
/* compiled from: DiskUtils */
public class C4658h {
    /* renamed from: a */
    public static long m20159a() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }
}
