package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C3292l;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new C3240a();

    /* renamed from: g */
    final int f10487g;

    /* renamed from: h */
    ParcelFileDescriptor f10488h;

    /* renamed from: i */
    final int f10489i;

    /* renamed from: j */
    private Bitmap f10490j = null;

    /* renamed from: k */
    private File f10491k;

    BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.f10487g = i;
        this.f10488h = parcelFileDescriptor;
        this.f10489i = i2;
    }

    /* renamed from: Y */
    private static final void m14040Y(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("BitmapTeleporter", "Could not close stream", e);
        }
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        if (this.f10488h == null) {
            Bitmap bitmap = this.f10490j;
            C3292l.m14240h(bitmap);
            Bitmap bitmap2 = bitmap;
            ByteBuffer allocate = ByteBuffer.allocate(bitmap2.getRowBytes() * bitmap2.getHeight());
            bitmap2.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            File file = this.f10491k;
            if (file != null) {
                try {
                    File createTempFile = File.createTempFile("teleporter", ".tmp", file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        this.f10488h = ParcelFileDescriptor.open(createTempFile, 268435456);
                        createTempFile.delete();
                        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(fileOutputStream));
                        try {
                            dataOutputStream.writeInt(array.length);
                            dataOutputStream.writeInt(bitmap2.getWidth());
                            dataOutputStream.writeInt(bitmap2.getHeight());
                            dataOutputStream.writeUTF(bitmap2.getConfig().toString());
                            dataOutputStream.write(array);
                            m14040Y(dataOutputStream);
                        } catch (IOException e) {
                            throw new IllegalStateException("Could not write into unlinked file", e);
                        } catch (Throwable th) {
                            m14040Y(dataOutputStream);
                            throw th;
                        }
                    } catch (FileNotFoundException unused) {
                        throw new IllegalStateException("Temporary file is somehow already deleted");
                    }
                } catch (IOException e2) {
                    throw new IllegalStateException("Could not create temporary file", e2);
                }
            } else {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
            }
        }
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f10487g);
        C3315b.m14321m(parcel, 2, this.f10488h, i | 1, false);
        C3315b.m14316h(parcel, 3, this.f10489i);
        C3315b.m14310b(parcel, a);
        this.f10488h = null;
    }
}
