package com.sg.m3mouseislandsim.dao;

import com.sg.m3mouseislandsim.dto.mapTile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author naris
 */
public class mapRead {

    /*fields*/
    private mapTile[][] roundMap;

    //file IO stuff
    public String mapName;
    public int totalTiles;
    public int width;
    public int height;
    public static final String MAP_FILE = "islandmap.txt";
    //TODO need an output file

    /*getter/setters*/
    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public int getTotalTiles() {
        return totalTiles;
    }

    public void setTotalTiles(int totalTiles) {
        this.totalTiles = totalTiles;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    /*data (un)marshalling*/
    private mapTile[][] unmarshallMap(mapTile tile) {
        mapTile[][] map = new mapTile[getWidth()][getHeight()];
        
        for (int i = 0; i < getWidth(); i++) {
            for (int j = 0; j < getHeight(); j++) {
                map[i][j]=
            }
        }

        return map;
    }

    private void loadMap() throws mapReadException {
        Scanner sc;

        try {
            sc = new Scanner(new BufferedReader(new FileReader(MAP_FILE)));
        } catch (IOException e) {
            throw new mapReadException("Could not read map file", e);
        }

        String currentLine;
        mapTile[][] currentMap;
        int currentMapTile;

        //process first couple lines
        //1 = name
        currentLine = sc.nextLine();
        this.setMapName(currentLine);
        //2 = total tiles
        currentLine = sc.nextLine();
        this.setTotalTiles(Integer.parseInt(currentLine));
        //3 = width
        currentLine = sc.nextLine();
        this.setWidth(Integer.parseInt(currentLine));
        //4 = height
        currentLine = sc.nextLine();
        this.setHeight(Integer.parseInt(currentLine));

        //process entire map
        while (sc.hasNextLine()) {
            currentMapTile = Integer.parseInt(sc.next());
            unmarshallMap();
            //TODO call marshall method
        }

        sc.close();
    }
}
