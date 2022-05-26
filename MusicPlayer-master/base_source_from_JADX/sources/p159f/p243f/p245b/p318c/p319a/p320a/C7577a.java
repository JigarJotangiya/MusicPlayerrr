package p159f.p243f.p245b.p318c.p319a.p320a;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: f.f.b.c.a.a.a */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final class C7577a {

    /* renamed from: a */
    private final String f32944a;

    public C7577a(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String valueOf = String.valueOf(sb.toString());
        String valueOf2 = String.valueOf(str);
        this.f32944a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: f */
    private static String m42324f(String str, String str2, Object... objArr) {
        String str3;
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                String valueOf = String.valueOf(str2);
                if (valueOf.length() != 0) {
                    str3 = "Unable to format ".concat(valueOf);
                } else {
                    str3 = new String("Unable to format ");
                }
                Log.e("PlayCore", str3, e);
                String join = TextUtils.join(", ", objArr);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(join).length());
                sb.append(str2);
                sb.append(" [");
                sb.append(join);
                sb.append("]");
                str2 = sb.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(" : ");
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: a */
    public final int mo28574a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", m42324f(this.f32944a, str, objArr));
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo28575b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m42324f(this.f32944a, str, objArr));
        }
        return 0;
    }

    /* renamed from: c */
    public final int mo28576c(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m42324f(this.f32944a, str, objArr), th);
        }
        return 0;
    }

    /* renamed from: d */
    public final int mo28577d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", m42324f(this.f32944a, str, objArr));
        }
        return 0;
    }

    /* renamed from: e */
    public final int mo28578e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", m42324f(this.f32944a, str, objArr));
        }
        return 0;
    }
}
