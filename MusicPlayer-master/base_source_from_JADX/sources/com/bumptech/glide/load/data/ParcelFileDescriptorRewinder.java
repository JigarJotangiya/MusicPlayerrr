package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.data.C1754e;
import java.io.IOException;

public final class ParcelFileDescriptorRewinder implements C1754e<ParcelFileDescriptor> {

    /* renamed from: a */
    private final InternalRewinder f6519a;

    private static final class InternalRewinder {

        /* renamed from: a */
        private final ParcelFileDescriptor f6520a;

        InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f6520a = parcelFileDescriptor;
        }

        /* access modifiers changed from: package-private */
        public ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.f6520a.getFileDescriptor(), 0, OsConstants.SEEK_SET);
                return this.f6520a;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a */
    public static final class C1748a implements C1754e.C1755a<ParcelFileDescriptor> {
        /* renamed from: a */
        public Class<ParcelFileDescriptor> mo7685a() {
            return ParcelFileDescriptor.class;
        }

        /* renamed from: c */
        public C1754e<ParcelFileDescriptor> mo7686b(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f6519a = new InternalRewinder(parcelFileDescriptor);
    }

    /* renamed from: c */
    public static boolean m8698c() {
        return Build.VERSION.SDK_INT >= 21;
    }

    /* renamed from: b */
    public void mo7682b() {
    }

    /* renamed from: d */
    public ParcelFileDescriptor mo7681a() throws IOException {
        return this.f6519a.rewind();
    }
}
