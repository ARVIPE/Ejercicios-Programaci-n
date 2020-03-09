<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="html" encoding="UTF-8"/>

  <xsl:template match="/periodico">
    <html>
      <head>
        <title>El Mundo Yesterday</title>
        <style>
          thead td {
          color: #FFFFFF;
          }
          table img {
          width: 50px;
          }
        </style>
      </head>
      <body>
        <td align="center">
          <img src="http://webdidacticarafaelmunoz.appspot.com/lmsgi/ejercicios-cap5/examen/2015-enero/recursos/el-mundo-yesterday.jpg"/>
        </td>
  
        <xsl:for-each select="noticias/noticia">
          <xsl:value-of select="cadaNoticia" />
        </xsl:for-each>
      </body>
    </html>
  </xsl:template>

  <xsl:template name="cadaNoticia">
      <xsl:param name="titular"/>
      <xsl:param name="subtitular"/>
   
      <td>
        <img src="{.}"/>
      </td>
      <td>
        <xsl:value-of select="@imagen"/>
      </td>
  </xsl:template>
  
</xsl:stylesheet>