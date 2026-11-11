WebView webView = findViewById(R.id.webView);   // your existing line

webView.getSettings().setJavaScriptEnabled(true);
webView.getSettings().setDomStorageEnabled(true);

webView.addJavascriptInterface(new Object() {
    @android.webkit.JavascriptInterface
    public void exitApp() {
        runOnUiThread(() -> finishAffinity());
    }
}, "AndroidBridge");
