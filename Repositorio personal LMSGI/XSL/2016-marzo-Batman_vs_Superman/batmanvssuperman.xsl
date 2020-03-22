<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="html" encoding="UTF-8"/>

  <xsl:template match="/cine">
    <html>
      <head>
        <title>Batman vs Superman</title>
        <style>
          thead td {
          background: #5077cc;
          color: #FFFFFF;
          }
          img {
          width: 60%;
          }
          .titulo {
          background: #1e3356;
          color: #FFFFFF;
          }
        </style>
      </head>
      <body>
        <h1>
          <xsl:value-of select="@nombre"/>
        </h1>
        <xsl:for-each select="titulo">
          <xsl:call-template name="pintaFila"></xsl:call-template>
        <h2>
          <xsl:value-of select="@nombre"/>
        </h2>
        <h3>
          <xsl:value-of select="@estreno"/>
        </h3>
        </xsl:for-each>
        
        
        <xsl:call-template name="tablaDeSesiones"></xsl:call-template>
        <xsl:call-template name="cartelera"></xsl:call-template>
      </body>
    </html>
  </xsl:template>

  <xsl:template name="pintaFila">

    <tr>
      
      <td>
        <img src="{/cine/titulo/imagen}"/>
      </td>
      <td>
        <xsl:value-of select="@desc"/>
      </td>
    </tr>

  </xsl:template>

  <xsl:template name="bucleForFila">
    <xsl:param name="i"/>
    <xsl:if test="$i &lt;= 4">
      <tr>
        <xsl:call-template name="bucleForColumna">
          <xsl:with-param name="i">
            <xsl:value-of select="$i"/>
          </xsl:with-param>
          <xsl:with-param name="j">1</xsl:with-param>
        </xsl:call-template>
      </tr>
      <xsl:call-template name="bucleForFila">
        <xsl:with-param name="i">
          <xsl:value-of select="$i + 1"/>
        </xsl:with-param>
      </xsl:call-template>
    </xsl:if>
  </xsl:template>

  <xsl:template name="bucleForColumna">
    <xsl:param name="i"/>
    <xsl:param name="j"/>
    <xsl:if test="$j &lt;= 4">
      <xsl:call-template name="celda">
        <xsl:with-param name="x">
          <xsl:value-of select="$j"/>
        </xsl:with-param>
        <xsl:with-param name="y">
          <xsl:value-of select="$i"/>
        </xsl:with-param>
      </xsl:call-template>
      <xsl:call-template name="bucleForColumna">
        <xsl:with-param name="i">
          <xsl:value-of select="$i"/>
        </xsl:with-param>
        <xsl:with-param name="j">
          <xsl:value-of select="$j + 1"/>
        </xsl:with-param>
      </xsl:call-template>
    </xsl:if>
  </xsl:template>

  <xsl:template name="celda">
    <xsl:param name="x"/>
    <xsl:param name="y"/>
    <td>
      <xsl:choose>
        <xsl:when test="ocupado[@fila=$y and @asiento=$x]">
          <img src="{/cine/imagenes/imagen[@id='ocupado']}"></img>
        </xsl:when>
        <xsl:otherwise>
          <img src="{/cine/imagenes/imagen[@id='libre']}"></img>
        </xsl:otherwise>
      </xsl:choose>
    </td>
  </xsl:template>

  <xsl:template name="tablaDeSesiones">
    <table border="1" width="70%">
      <xsl:for-each select="sesiones/sesion">
        <xsl:choose>
          <xsl:when test="position() mod 2 = 1">
            <xsl:call-template name="tablaDeSesion">
              <xsl:with-param name="color">#99def7</xsl:with-param>
            </xsl:call-template>
          </xsl:when>
          <xsl:otherwise>
            <xsl:call-template name="tablaDeSesion">
              <xsl:with-param name="color">#ffffff</xsl:with-param>
            </xsl:call-template>
          </xsl:otherwise>
        </xsl:choose>
      </xsl:for-each>
    </table>
  </xsl:template>

  <xsl:template name="tablaDeSesion">
    <xsl:param name="color"/> 
        <tr>
          <td align="center" style="background:{$color}">
              Sesión:
              <xsl:value-of select="position()"/>
              - Hora:
              <xsl:value-of select="@hora"/>
              <table border="1" width="30%" align="center">
                    <xsl:call-template name="bucleForFila">
                      <xsl:with-param name="i">1</xsl:with-param>
                    </xsl:call-template>
              </table>
            </td>
        </tr>
  </xsl:template>

  <xsl:template name="cartelera">
    <h2>Otras películas</h2>
    <table border="1">
      <xsl:for-each select="cartelera/pelicula">
        <xsl:variable name="id">
          <xsl:value-of select="@id"/>
        </xsl:variable>
      <tr>
        <td>
          <img style="width:250px" src="{/cine/imagenes/imagen[@id=$id]}"></img>
        </td>
        <td>
          <xsl:value-of select="@nombre"/>
        </td>
     </tr>
      </xsl:for-each>
    </table>
    
  </xsl:template>

</xsl:stylesheet>