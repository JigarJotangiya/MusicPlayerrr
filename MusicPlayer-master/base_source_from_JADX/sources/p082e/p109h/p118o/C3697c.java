package p082e.p109h.p118o;

import android.util.Log;
import java.io.Writer;

@Deprecated
/* renamed from: e.h.o.c */
/* compiled from: LogWriter */
public class C3697c extends Writer {

    /* renamed from: g */
    private final String f11711g;

    /* renamed from: h */
    private StringBuilder f11712h = new StringBuilder(128);

    public C3697c(String str) {
        this.f11711g = str;
    }

    /* renamed from: c */
    private void m15813c() {
        if (this.f11712h.length() > 0) {
            Log.d(this.f11711g, this.f11712h.toString());
            StringBuilder sb = this.f11712h;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        m15813c();
    }

    public void flush() {
        m15813c();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                m15813c();
            } else {
                this.f11712h.append(c);
            }
        }
    }
}
