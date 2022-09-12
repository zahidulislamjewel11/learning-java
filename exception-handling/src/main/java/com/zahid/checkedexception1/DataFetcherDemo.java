package com.zahid.checkedexception1;

public class DataFetcherDemo {
    private DataFetcher dataFetcher;

    public DataFetcherDemo(DataFetcher dataFetcher)
    {
        this.dataFetcher = dataFetcher;
    }

//    public void fetchData()
//    {
//        String url = "http://www.google.com";
//        try
//        {
//            String fetchedData = dataFetcher.fetchDataFromUrl(url);
//            System.out.println(fetchedData);
//        }
//        catch (CheckedException e)
//        {
//            e.printStackTrace();
//        }
//    }

    public void fetchData() throws CheckedException
    {
        String url = "http://www.google.com";
        String fetchedData = dataFetcher.fetchDataFromUrl(url);
        System.out.println(fetchedData);
    }

    public static void main(String[] args) throws CheckedException {
        DataFetcherDemo dataFetcherDemo = new DataFetcherDemo(new DataFetcher());
        dataFetcherDemo.fetchData();
    }
}
