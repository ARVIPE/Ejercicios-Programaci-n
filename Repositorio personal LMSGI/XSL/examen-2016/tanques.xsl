<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="html" encoding="iso-8859-1" />
	<xsl:template match="/juegoTanques">
		<html>
			<head>
				<title>Juego De Tanques</title>
			</head>
			<style type="text/css">
				body {
				margin: 50px;
				padding: 0px;
				background: #2372DE;
				font-family: 'Open Sans', sans-serif;
				font-size: 11pt;
				color: #FFFFFF;
				text-align:center;
				}

				.tituloTabla {
				font-weight: bold;
				text-align: center;
				}
			</style>
			<body>
				<xsl:apply-templates select="jugadasDescritas"/>
			</body>
		</html>
	</xsl:template>

	<xsl:template match="jugadasDescritas">
		<table>
			<tr>
				<td>Jugada</td>
				<td>Tanque</td>
				<td>Jugada</td>
			</tr>
      <xsl:for-each select="jugada"/>
		</table>
	</xsl:template>



</xsl:stylesheet>
