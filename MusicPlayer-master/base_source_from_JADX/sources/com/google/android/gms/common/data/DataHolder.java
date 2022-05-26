package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C3292l;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

@KeepName
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    @RecentlyNonNull
    public static final Parcelable.Creator<DataHolder> CREATOR = new C3242c();

    /* renamed from: g */
    final int f10492g;

    /* renamed from: h */
    private final String[] f10493h;

    /* renamed from: i */
    Bundle f10494i;

    /* renamed from: j */
    private final CursorWindow[] f10495j;

    /* renamed from: k */
    private final int f10496k;

    /* renamed from: l */
    private final Bundle f10497l;

    /* renamed from: m */
    int[] f10498m;

    /* renamed from: n */
    boolean f10499n = false;

    /* renamed from: o */
    private boolean f10500o = true;

    /* renamed from: com.google.android.gms.common.data.DataHolder$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static class C3239a {
        /* synthetic */ C3239a(String[] strArr, String str, C3241b bVar) {
            C3292l.m14240h(strArr);
            new ArrayList();
            new HashMap();
        }
    }

    static {
        new C3241b(new String[0], (String) null);
    }

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f10492g = i;
        this.f10493h = strArr;
        this.f10495j = cursorWindowArr;
        this.f10496k = i2;
        this.f10497l = bundle;
    }

    @RecentlyNullable
    /* renamed from: Y */
    public Bundle mo11696Y() {
        return this.f10497l;
    }

    public void close() {
        synchronized (this) {
            if (!this.f10499n) {
                this.f10499n = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f10495j;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            if (this.f10500o && this.f10495j.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }

    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.f10499n;
        }
        return z;
    }

    /* renamed from: m0 */
    public int mo11700m0() {
        return this.f10496k;
    }

    /* renamed from: n0 */
    public final void mo11701n0() {
        this.f10494i = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.f10493h;
            if (i2 >= strArr.length) {
                break;
            }
            this.f10494i.putInt(strArr[i2], i2);
            i2++;
        }
        this.f10498m = new int[this.f10495j.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f10495j;
            if (i < cursorWindowArr.length) {
                this.f10498m[i] = i3;
                i3 += this.f10495j[i].getNumRows() - (i3 - cursorWindowArr[i].getStartPosition());
                i++;
            } else {
                return;
            }
        }
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14323o(parcel, 1, this.f10493h, false);
        C3315b.m14325q(parcel, 2, this.f10495j, i, false);
        C3315b.m14316h(parcel, 3, mo11700m0());
        C3315b.m14312d(parcel, 4, mo11696Y(), false);
        C3315b.m14316h(parcel, 1000, this.f10492g);
        C3315b.m14310b(parcel, a);
        if ((i & 1) != 0) {
            close();
        }
    }
}
