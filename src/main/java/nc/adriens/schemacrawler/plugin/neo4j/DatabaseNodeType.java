/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nc.adriens.schemacrawler.plugin.neo4j;

import org.neo4j.graphdb.Label;

/**
 *
 * @author salad74
 */
public enum DatabaseNodeType implements Label{
    SCHEMA, TABLE, TABLE_COLUMN
}
