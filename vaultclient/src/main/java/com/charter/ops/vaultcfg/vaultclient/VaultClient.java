package com.charter.ops.vaultcfg.vaultclient;

import com.bettercloud.vault.VaultConfig;
import com.bettercloud.vault.VaultException;

public class VaultClient {

    private final String vaultUrl;
    private final String vaultToken;
    private final VaultConfig vaultConfig;

    VaultClient(String vaultUrl, String vaultToken) throws VaultException {
        this.vaultUrl = vaultUrl;
        this.vaultToken = vaultToken;
            vaultConfig = new VaultConfig()
                    .address(vaultUrl)
                    .token(vaultToken)
                    .build();
    }

    public static void main(String[] args) {
        try {
            VaultClient instance = new VaultClient("http://127.0.0.1:8200", "3c9fd6be-7bc2-9d1f-6fb3-cd746c0fc4e8");
        } catch (VaultException e) {
            e.printStackTrace();
        }
    }

}