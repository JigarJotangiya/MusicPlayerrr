package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class oq0 extends SSLSocketFactory {

    /* renamed from: a */
    final SSLSocketFactory f21119a = ((SSLSocketFactory) SSLSocketFactory.getDefault());

    /* renamed from: b */
    final /* synthetic */ pq0 f21120b;

    oq0(pq0 pq0) {
        this.f21120b = pq0;
    }

    /* renamed from: a */
    private final Socket m28655a(Socket socket) throws SocketException {
        if (this.f21120b.f21473s > 0) {
            socket.setReceiveBufferSize(this.f21120b.f21473s);
        }
        this.f21120b.f21474t.add(socket);
        return socket;
    }

    public final Socket createSocket(String str, int i) throws IOException {
        Socket createSocket = this.f21119a.createSocket(str, i);
        m28655a(createSocket);
        return createSocket;
    }

    public final String[] getDefaultCipherSuites() {
        return this.f21119a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f21119a.getSupportedCipherSuites();
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket createSocket = this.f21119a.createSocket(str, i, inetAddress, i2);
        m28655a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket createSocket = this.f21119a.createSocket(inetAddress, i);
        m28655a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket createSocket = this.f21119a.createSocket(inetAddress, i, inetAddress2, i2);
        m28655a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket createSocket = this.f21119a.createSocket(socket, str, i, z);
        m28655a(createSocket);
        return createSocket;
    }
}
