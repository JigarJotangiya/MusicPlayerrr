package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class wo0 extends SSLSocketFactory {

    /* renamed from: a */
    final SSLSocketFactory f25473a = ((SSLSocketFactory) SSLSocketFactory.getDefault());

    /* renamed from: b */
    final /* synthetic */ yo0 f25474b;

    wo0(yo0 yo0) {
        this.f25474b = yo0;
    }

    /* renamed from: a */
    private final Socket m33246a(Socket socket) throws SocketException {
        if (this.f25474b.f26445o > 0) {
            socket.setReceiveBufferSize(this.f25474b.f26445o);
        }
        this.f25474b.f26446p.add(socket);
        return socket;
    }

    public final Socket createSocket(String str, int i) throws IOException {
        Socket createSocket = this.f25473a.createSocket(str, i);
        m33246a(createSocket);
        return createSocket;
    }

    public final String[] getDefaultCipherSuites() {
        return this.f25473a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f25473a.getSupportedCipherSuites();
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket createSocket = this.f25473a.createSocket(str, i, inetAddress, i2);
        m33246a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket createSocket = this.f25473a.createSocket(inetAddress, i);
        m33246a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket createSocket = this.f25473a.createSocket(inetAddress, i, inetAddress2, i2);
        m33246a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket createSocket = this.f25473a.createSocket(socket, str, i, z);
        m33246a(createSocket);
        return createSocket;
    }
}
