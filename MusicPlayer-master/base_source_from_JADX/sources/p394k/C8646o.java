package p394k;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import p369i.p387z.p389d.C8594l;

/* renamed from: k.o */
/* compiled from: JvmOkio.kt */
final /* synthetic */ class C8646o {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Logger f34992a = Logger.getLogger("okio.Okio");

    /* renamed from: b */
    public static final boolean m46992b(AssertionError assertionError) {
        C8594l.m46771e(assertionError, "$this$isAndroidGetsocknameError");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? C8437p.m46566v(message, "getsockname failed", false, 2, (Object) null) : false;
    }

    /* renamed from: c */
    public static final C8659y m46993c(Socket socket) throws IOException {
        C8594l.m46771e(socket, "$this$sink");
        C8660z zVar = new C8660z(socket);
        OutputStream outputStream = socket.getOutputStream();
        C8594l.m46770d(outputStream, "getOutputStream()");
        return zVar.mo30656w(new C8650r(outputStream, zVar));
    }

    /* renamed from: d */
    public static final C8620a0 m46994d(File file) throws FileNotFoundException {
        C8594l.m46771e(file, "$this$source");
        return C8645n.m46989f(new FileInputStream(file));
    }

    /* renamed from: e */
    public static final C8620a0 m46995e(InputStream inputStream) {
        C8594l.m46771e(inputStream, "$this$source");
        return new C8644m(inputStream, new C8622b0());
    }

    /* renamed from: f */
    public static final C8620a0 m46996f(Socket socket) throws IOException {
        C8594l.m46771e(socket, "$this$source");
        C8660z zVar = new C8660z(socket);
        InputStream inputStream = socket.getInputStream();
        C8594l.m46770d(inputStream, "getInputStream()");
        return zVar.mo30657x(new C8644m(inputStream, zVar));
    }
}
