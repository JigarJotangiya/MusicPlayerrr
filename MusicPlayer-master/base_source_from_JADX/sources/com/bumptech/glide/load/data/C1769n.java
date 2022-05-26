package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.n */
/* compiled from: StreamLocalUriFetcher */
public class C1769n extends C1767l<InputStream> {

    /* renamed from: j */
    private static final UriMatcher f6548j;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f6548j = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public C1769n(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: i */
    private InputStream m8773i(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int match = f6548j.match(uri);
        if (match != 1) {
            if (match == 3) {
                return m8774j(contentResolver, uri);
            }
            if (match != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            return m8774j(contentResolver, lookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* renamed from: j */
    private InputStream m8774j(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    /* renamed from: a */
    public Class<InputStream> mo7688a() {
        return InputStream.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo7689c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public InputStream mo7690f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream i = m8773i(uri, contentResolver);
        if (i != null) {
            return i;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }
}
