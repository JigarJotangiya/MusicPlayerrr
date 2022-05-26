package p394k;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p369i.p387z.p389d.C8594l;

/* renamed from: k.z */
/* compiled from: JvmOkio.kt */
final class C8660z extends C8628d {

    /* renamed from: l */
    private final Socket f35026l;

    public C8660z(Socket socket) {
        C8594l.m46771e(socket, "socket");
        this.f35026l = socket;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public IOException mo30655u(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo29465y() {
        try {
            this.f35026l.close();
        } catch (Exception e) {
            Logger a = C8646o.f34992a;
            Level level = Level.WARNING;
            a.log(level, "Failed to close timed out socket " + this.f35026l, e);
        } catch (AssertionError e2) {
            if (C8645n.m46986c(e2)) {
                Logger a2 = C8646o.f34992a;
                Level level2 = Level.WARNING;
                a2.log(level2, "Failed to close timed out socket " + this.f35026l, e2);
                return;
            }
            throw e2;
        }
    }
}
