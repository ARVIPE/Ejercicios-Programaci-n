<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="html" encoding="UTF-8"/>

  <xsl:template match="/partidoBaloncesto">
    <html>
      <head>
        <title>Partido de Baloncesto</title>
        <style>
          thead td {
          background: #5077cc;
          color: #FFFFFF;
          }
          table img {
          width: 50px;
          }
          .titulo {
          background: #1e3356;
          color: #FFFFFF;
          }
        </style>
      </head>
      <body>
        <h1 align="center"> Baloncesto: Baloncesto Lucena - Unicaja Baloncesto </h1>
        <table border="1" width="100%">
          <tr class="titulo" align="center">
            <td>Equipo</td>
            <td>Jugador</td>
            <td>Dorsal</td>
            <td>Apodo</td>
            <td>Puntos</td>
            <td>Rebotes</td>
            <td>Asistencias</td>
          </tr>
            <xsl:for-each select="equipo/jugador">
              <tr>
              <td>
                <xsl:value-of select="@nombre"/>
              </td>
              <td>
                <xsl:value-of select ="@dorsal"/>
              </td>
              <td>
                <xsl:value-of select="@apodo"/>
              </td>
              <td>
                <xsl:value-of select="@putos"/>
              </td>
              <td>
                <xsl:value-of select="@rebotes"/>
              </td>
              <td>
                <xsl:value-of select="@asistencias"/>
              </td>
              <td>
                <xsl:value-of select="@posicionX"/>
              </td>
              <td>
                <xsl:value-of select="@posicionY"/>
              </td>
              </tr>
            </xsl:for-each>
          
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>