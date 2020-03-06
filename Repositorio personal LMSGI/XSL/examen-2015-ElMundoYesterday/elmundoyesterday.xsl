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
    </html>
  </xsl:template>
</xsl:stylesheet>