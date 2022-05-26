package androidx.room.p006d1;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.room.C0994s0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import p082e.p149u.p150a.C4214b;
import p082e.p149u.p150a.C4221e;

/* renamed from: androidx.room.d1.c */
/* compiled from: DBUtil */
public class C0941c {
    /* renamed from: a */
    public static CancellationSignal m5702a() {
        if (Build.VERSION.SDK_INT >= 16) {
            return new CancellationSignal();
        }
        return null;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static void m5703b(C4214b bVar) {
        ArrayList<String> arrayList = new ArrayList<>();
        Cursor X = bVar.mo5531X("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (X.moveToNext()) {
            try {
                arrayList.add(X.getString(0));
            } catch (Throwable th) {
                X.close();
                throw th;
            }
        }
        X.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                bVar.mo5543q("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    /* renamed from: c */
    public static Cursor m5704c(C0994s0 s0Var, C4221e eVar, boolean z, CancellationSignal cancellationSignal) {
        Cursor A = s0Var.mo5571A(eVar, cancellationSignal);
        if (!z || !(A instanceof AbstractWindowedCursor)) {
            return A;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) A;
        int count = abstractWindowedCursor.getCount();
        return (Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? C0940b.m5697a(abstractWindowedCursor) : A;
    }

    /* renamed from: d */
    public static int m5705d(File file) throws IOException {
        FileChannel fileChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            fileChannel = new FileInputStream(file).getChannel();
            fileChannel.tryLock(60, 4, true);
            fileChannel.position(60);
            if (fileChannel.read(allocate) == 4) {
                allocate.rewind();
                return allocate.getInt();
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } finally {
            if (fileChannel != null) {
                fileChannel.close();
            }
        }
    }
}
