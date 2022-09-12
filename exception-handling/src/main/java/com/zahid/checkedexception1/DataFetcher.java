package com.zahid.checkedexception1;
public class DataFetcher {
    public String fetchDataFromUrl(String url) throws CheckedException
    {
        if(url==null)
        {
            throw new CheckedException("URL not found");
        }
        String data = null;
        return data;
    }
}
